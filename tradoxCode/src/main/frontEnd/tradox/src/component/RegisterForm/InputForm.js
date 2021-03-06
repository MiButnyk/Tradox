import style from "./Register.module.css";
import React, {useState}  from 'react'
import Picker from "./CountryPicker";
import {useEffect} from "react/cjs/react.production.min";

function InputForm(props) {
    const before = style.input;
    const after  = style.wrongInput;

    let [state,setState] = useState(props.value != null ? props.value : "Andorra");

    function changeState(e) {
        e.preventDefault()
        setState(e.target.value)
        props.changeState(props.keyOf,e.target.value)
    }

    return (
        <div className={style.oneInput}>
            <span className={style.naming}>
                {props.title}
            </span>
            {props.type === "countryPicker"
                ? <Picker value={state} keyOf={"citizenship"} changeState={changeState} array={props.array}/>
                : <input type={props.type} value={state == "Andorra" ? '' : state} className={!props.notFound ? before: before + " " + after} placeholder={props.placeholder} onChange={changeState} required/>}
        </div>
    )
}

export default InputForm