import React from 'react'
import style from './NoData.module.css'
export default function News() {
    return (
        <div className = {style.container}>
            <span className={style.msg}>Oooops We don't have any data about this country</span>
        </div>
    )
}