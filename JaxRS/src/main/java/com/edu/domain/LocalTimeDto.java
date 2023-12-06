package com.edu.domain;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import static lombok.AccessLevel.PRIVATE;

@XmlRootElement(name = "LocalTime")
@Getter
@Setter
@EqualsAndHashCode
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
