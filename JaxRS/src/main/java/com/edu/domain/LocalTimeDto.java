package com.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import static lombok.AccessLevel.PRIVATE;

@XmlRootElement(name = "LocalTime")
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
public class LocalTimeDto {
    private LocalDateTime localDateTime;
    private OffsetDateTime offsetDateTime;

    public static LocalTimeDto createInstance() {
        final OffsetDateTime now = OffsetDateTime.now();
        return new LocalTimeDto(now.toLocalDateTime(), now);
    }
}
