package com.nc.tradox.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nc.tradox.dao.impl.TradoxDataAccessService;
import com.nc.tradox.model.Country;
import com.nc.tradox.model.Departure;
import com.nc.tradox.model.Destination;
import com.nc.tradox.model.impl.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DocumentApi {

    private static final Logger log = Logger.getLogger(DocumentApi.class.getName());
    TradoxDataAccessService tradoxDataAccessService;

    public List<HaveDocument> documentList(){
        ObjectMapper objectMapper = new ObjectMapper();

        File jsonFile = new File("tradoxCode/src/main/resources/jsonsAndFriends/documents.json");

        if (!jsonFile.exists()){
            log.log(Level.SEVERE,"File does not exist");
        }else if (jsonFile.isDirectory()){
            log.log(Level.SEVERE,"This is directory, not file");
        }

        Root root = null;
        try {
            root = objectMapper.readValue(jsonFile, Root.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<HaveDocument> haveDocumentList = new ArrayList<>();
        if (root != null) {
            for (MainArr mainArr : root.mainArr) {
                HaveDocument haveDocument = new HaveDocument();

                Country departure_country = tradoxDataAccessService.getCountryById(mainArr.departure_country);
                Departure departure = new DepartureImpl(departure_country);

                haveDocument.setDeparture(departure);

                for (Arr arr : mainArr.arr) {
                    Country destination_country = tradoxDataAccessService.getCountryById(arr.destination_country);
                    Destination destination = new DestinationImpl(destination_country);

                    haveDocument.setDocumentId(arr.document_id);
                    haveDocument.setDestination(destination);
                }
                haveDocumentList.add(haveDocument);
            }
            return haveDocumentList;
        }
        return null;
    }

    public static class Arr{
        public String destination_country;
        public int document_id;
    }

    public static class MainArr{
        public String departure_country;
        public List<Arr> arr;
    }

    public static class Root{
        public List<MainArr> mainArr;
    }
}
