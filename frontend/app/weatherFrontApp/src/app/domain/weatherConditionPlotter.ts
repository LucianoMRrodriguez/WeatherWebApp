export class WeatherConditionPlotter {
    conditionList : string[] = [
        "thunderstorms",
        "typhoon",
        "typhoon",
        "thunderstorms",
        "thunderstorms",
        "rain_s_snow",
        "sleet",
        "snow_s_rain",
        "rain_light",
        "rain_light",
        "rain_light",
        "rain",
        "snow_s_cloudy",
        "snow_light",
        "snow",
        "snow",
        "thunderstorms",
        "sleet",
        "windy",
        "fog",
        "mist",
        "mist",
        "windy",
        "windy",
        "freezing",
        "cloudy",
        "partly_cloudy",
        "partly_cloudy",
        "sunny_s_cloudy",
        "sunny_s_cloudy",
        "sunny",
        "sunny",
        "sunny_s_cloudy",
        "sunny_s_cloudy",
        "thunderstorms",
        "hot",
        "thunderstorms",
        "thunderstorms",
        "rain",
        "rain",
        "snow",
        "snow",
        "snow",
        "partly_cloudy",
        "thunderstorms",
        "snow_s_rain",
        "thunderstorms"
    ]

    getImgSrc(cond:string){
        if(cond){
            return this.conditionMap[cond];
        }
        return "";
    }
}