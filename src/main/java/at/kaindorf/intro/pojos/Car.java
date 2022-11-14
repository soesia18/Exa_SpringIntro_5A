package at.kaindorf.intro.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String brand;
    private String model;
    private int power;
    private YearMonth produced;
}
