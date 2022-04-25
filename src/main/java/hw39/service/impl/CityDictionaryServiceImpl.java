package hw39.service.impl;

import hw39.dto.CityDto;
import hw39.service.CityDictionaryService;

import java.util.Set;

public class CityDictionaryServiceImpl implements CityDictionaryService {
    @Override
    public Set<CityDto> getCities() {
        return Set.of(new CityDto("SAMARA", "Самара"),
                new CityDto("PERM", "Пермь"),
                new CityDto("MOSCOW", "Москва"),
                new CityDto("KAZAN", "Казань"));
    }
}
