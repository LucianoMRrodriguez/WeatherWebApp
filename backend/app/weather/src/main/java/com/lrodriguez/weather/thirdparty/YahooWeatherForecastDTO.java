package com.lrodriguez.weather.thirdparty;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class YahooWeatherForecastDTO {
      @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastQueryDTO {
        Integer count;
        Date created;
        String lang;
          @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastResults {
              @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastChannelDTO {
                  @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastUnitsDTO {
                    
                    String distance;
                    String pressure;
                    String speed;
                    String temperature;
                }
                YahooWeatherForecastUnitsDTO units;
                String title;
                String link;
                String description;
                String language;
                Date lastBuildDate;
                Integer ttl;
                  @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastLocationDTO {
                    String city;
                    String country;
                    String region;
                }
                YahooWeatherForecastLocationDTO location;
                  @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastWindDTO {
                    Integer chill;
                    Integer direction;
                    Integer speed;
                }
                YahooWeatherForecastWindDTO wind;
                  @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastAtmosphereDTO {
                    Integer humidity;
                    Float pressure;
                    Integer rising;
                    Float visibility;
                }
                YahooWeatherForecastAtmosphereDTO atmosphere;
                  @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastAstronomyDTO {
                    LocalTime sunrise;
                    LocalTime sunset;
                }
                YahooWeatherForecastAstronomyDTO astronomy;
                  @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastImageDTO {
                    String title;
                    Integer width;
                    Integer height;
                    String link;
                    String url;
                }
                YahooWeatherForecastImageDTO image;
                  @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastItemDTO {
                    String title;
                    Float lat;
                    @JsonProperty("long")
                    Float longg;
                    String link;
                    Date pubDate;
                      @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastConditionDTO {
                        Integer code;
                        Date date;
                        Integer temp;
                        String text;
                    }
                    YahooWeatherForecastConditionDTO condition;
                      @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastForecastDTO {
                        Integer code;
                        Date date;
                        String day;
                        Integer high;
                        Integer low;
                        String text;
                    }
                    List<YahooWeatherForecastForecastDTO> forecast;
                    String description;
                      @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString public class YahooWeatherForecastGuidDTO {
                        Boolean isPermaLink;
                    }
                    YahooWeatherForecastGuidDTO guid;
                }
                YahooWeatherForecastItemDTO item;
            }
            List<YahooWeatherForecastChannelDTO> channel;
        }
        YahooWeatherForecastResults results;
    }
    YahooWeatherForecastQueryDTO query;
}