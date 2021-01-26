import React from "react";

let myMap = new Map().set("Andorra","AD").set("United Arab Emirates","AE").set("Afghanistan","AF")
        .set("Antigua and Barbuda","AG").set("Albania","AL").set("Armenia","AM")
        .set("Angola","AO").set("Argentina","AR").set("American Samoa", "AS")
        .set("Austria","AT").set("Australia","AU").set("Azerbaijan","AZ")
        .set("Bosnia","BA").set("Barbaros","BB").set("Bangladesh","BD")
        .set("Belgium","BE").set("Burkina Faso","BF").set("Bulgaria","BG")
        .set("Bahrain","BH").set("Burundi","BI").set("Benin","BJ")
        .set("Saint Barthelemy","BL").set("Brunei","BN").set("Bolivia","BO")
        .set("Bermuda","BM").set("Bonaire","BQ").set("Brazil","BR")
        .set("The Bahamas","BS").set("Bhutan","BT").set("Bouvet Island","BV")
        .set("Botswana","BW").set("Belarus","BY").set("Belize","BZ")
        .set("Canada","CA").set("Cocos Islands","CC").set("Democratic Republic of Congo","CD")
        .set("Central African Republic","CF").set("Republic of Congo","CG").set("Switzerland","CH")
        .set("Cote d`Ivoire","CI").set("Cook Islands","CK").set("Chile","CL")
        .set("Cameroon","CM").set("China","CN").set("Colombia","CO").set("Costa Rica","CR")
        .set("Cuba","CU").set("Cape Verde","CV").set("Curacao","CW")
        .set("Christmas Island","CX").set("Cyprus","CY").set("Czech Republic","CZ")
        .set("Germany","DE").set("Djibouti","DJ").set("Denmark","DK")
        .set("Dominica","DM").set("Dominican Republic","DO").set("Algeria","DZ")
        .set("Ecuador","EC").set("Egypt","EG").set("Estonia","EE")
        .set("Western Sahara","EH").set("Eritrea","ER").set("Spain","ES").set("Ethiopia","ET")
        .set("Finland","FI").set("Fiji","FJ").set("Falclan Islands","FK").set("Federated Stated of Micronesia","FM")
        .set("Faroe Islands","FO").set("France","FR").set("Gabon","GA").set("United Kingdom","GB")
        .set("Georgia","GE").set("Grenada","GD").set("French Guiana","GF").set("Guernsey","GG")
        .set("Ghana","GH").set("Gibraltar","GI").set("Greenland","GL").set("Gambia","GM")
        .set("Guinea","GN").set("Glorioso Islands","GO").set("Guadelope","GP").set("Equatoria Guinea","GQ")
        .set("Greece","GR").set("South Georgia and South Sandwich Islands","GS").set("Guatemala","GT")
        .set("Guam","GU").set("Guinea-Bissau","GW").set("Guyana","GY").set("Hong Kong","HR")
        .set("Heard Island and McDonald Islands","HM").set("Honduras","HN").set("Croatia","CR")
        .set("Haiti","HT").set("Hungary","HU").set("Indonesia","ID").set("Ireland","IE")
        .set("Israel","IL").set("Isle of Man","IM").set("India","IN").set("British Indian Ocean Territory","IO")
        .set("Iraq","IQ").set("Iran","IR").set("Iceland","IS").set("Italy","IT").set("Jersey","JE")
        .set("Jamaica","JM").set("Jordan","JO").set("Japan","JP").set("Juan De Nova Island","JU")
        .set("Kenya","KE").set("Kyrgyzstan","KY").set("Cambodia","KH").set("Kiribati","KI")
        .set("Comoros","KM").set("Saint Kitts and Nevis","KN").set("North Korea","KP").set("South Korea","KR")
        .set("Kosovo","XK").set("Kuwait","KW").set("Cayman Islands","KY").set("Kazakhstan","KZ")
        .set("Laos","LA").set("Lebanos","LB").set("Saint Lucia","LC").set("Liechtenstein","LI")
        .set("Sri Lanka","LK").set("Liberia","LR").set("Lesotho","LS").set("Lithuania","LT")
        .set("Luxembourg","LU").set("Latvia","LV").set("Libya","LY").set("Morocco","MA").set("Monaco","MC")
        .set("Moldova","MD").set("Madagascar","MG").set("Montenegro","ME").set("Saint Martin","MF")
        .set("Marshall Islands","MH").set("North Macedonia","MK").set("Mali","ML").set("Macao","MO")
        .set("Myanmar (Burma)","MM").set("Mongolia","MN").set("Northern Mariana Islands","MP")
        .set("Martinique","MQ").set("Mauritania","MR").set("Montserrat","MS").set("Malta","MT")
        .set("Mauritius","MU").set("Maldives","MV").set("Malawi","MW").set("Mexico","MX").set("Malaysia","MY")
        .set("Mozambique","MZ").set("Namibia","NA").set("New Caledonia","NC").set("Niger","NE").set("Norfolk Island","NF")
        .set("Nigeria","NG").set("Nicaragua","NI").set("Netherlands","NL").set("Norway","NO").set("Nepal","NP")
        .set("Nauru","NR").set("Niue","NU").set("New Zealand","NZ").set("Oman","OM").set("Panama","PA")
        .set("Peru","PE").set("French Polynesia","PF").set("Papua New Guinea","PG").set("Philippines","PH")
        .set("Pakistan","PK").set("Poland","PL").set("Saint Pierre and Miquelon","PM").set("Pitcairn Islands","PN")
        .set("Puerto Rico","PR").set("Palestine","PS").set("Portugal","PT").set("Palau","PW").set("Paraguay","PY")
        .set("Qatar","QA").set("Réunion","RE").set("Romania","RO").set("Serbia","RS").set("Russia","RU").set("Rwanda","RW")
        .set("Saudi Arabia","SA").set("Solomon Islands","SB").set("Seychelles","SC").set("Sudan","SD").set("Sweden","SE")
        .set("Singapore","SG").set("Saint Helena, Ascension and Tristan da Cunha","SH").set("Slovenia","SI")
        .set("Svalbard and Jan Mayen","SJ").set("Slovakia","SK").set("Sierra Leone","SL").set("San Marino","SM")
        .set("Senegal","SN").set("Somalia","SO").set("Suriname","SR").set("South Sudan","SS").set("São Tomé and Príncipe","ST")
        .set("El Salvador","SV").set("Sint Maarten","SX").set("Syria","SY").set("Eswatini","SZ").set("urks and Caicos Islands","TC")
        .set("Chad","TD").set("French Southern and Antarctic Lands","TF").set("Togo","TG").set("Thailand","TH").set("Tajikistan","TJ")
        .set("Tokelau","TK").set("Timor-Leste","TL").set("Turkmenistan","TM").set("Tunisia","TN").set("TO","TO").set("Turkey","TR")
        .set("Trinidad and Tobago","TT").set("Tuvalu","TV").set("Taiwan","TW").set("Tanzania","TZ").set("Ukraine","UA")
        .set("Uganda","UG").set("UM DQ","UM DQ").set("UM FQ","UM FQ").set("UM HQ","UM HQ").set("UM JQ","UM JQ").set("UM MQ","UM MQ")
        .set("UM WQ","UM WQ").set("United States of America","US").set("Uruguay","UY").set("Uzbekistan","UZ")
        .set("Vatican City","VA").set("Saint Vincent and the Grenadines","VC").set("Venezuela","VE").set("British Virgin Islands","VG")
        .set("U.S. Virgin Islands","VI").set("Vietnam","VN").set("Vanuatu","VU").set("Wallis and Futuna","WF").set("Samoa","WS")
        .set("Yemen","YE").set("Mayotte","YT").set("South Africa","ZA").set("Zambia","ZM").set("Zimbabwe","ZW");


export default myMap;
