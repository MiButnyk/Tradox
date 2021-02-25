import React, {useState, useEffect} from 'react'
import CovidInfo from './CovidInfo/CovidInfo'
import styles from './CountryInfo.module.css'
import Documents from './Documents/Documents'
import Consulates from './Consulates/Consulates'
import News from './News/News'
import {NavLink} from 'react-router-dom'
 function CountryInfo(props) {
    const [opened, setOpened] = useState(false)
    const [departure, setDeparture] = useState([])
     const [covidInfo, setCovidInfo] = useState([])
     const [data, setData] = useState([])
     useEffect(() => {
         console.log(props);
         if(props.data.object.fullRoute.departure != undefined && props.data.object.covidInfo){
             setDeparture(props.data.object.fullRoute.departure)
             setCovidInfo(props.data.object.covidInfo)
             setData(props.data)
             if(props.data.object.status.status == "open"){
                setOpened(true)
             }
         console.log(props.data)
         localStorage.setItem("departure",props.data.object.fullRoute.departure.shortName);
         localStorage.setItem("destination",props.data.object.fullRoute.destination.shortName);
         }
     }, [departure])

    return (
        <div className = {styles.container}>
            <div className={styles.wrapper}>
            {opened ? <div className = {styles.openCountry}>
                <h1 className = {styles.countryText}>{props.data.object.fullRoute.destination.fullName} is open for you</h1>
            </div>  :
            <div className = {styles.closedCountry}>
                <h1 className = {styles.countryText}>{props.data.object.fullRoute.destination.fullName} is closed for you</h1>
            </div>}
            <CovidInfo covidInfo = {covidInfo}/>
            <Documents data = {props.data}/>
            <NavLink to = '/docs' ><div className={styles.fillBtn}>
                <h2 className={styles.fillDocsTxT}>Fill out documents</h2>
            </div></NavLink>
            <Consulates departure = {props.data.object.fullRoute.departure} data = {props.data}/>
            <News data = {props.data}/>
            </div>
        </div>
    )
}
export default CountryInfo;