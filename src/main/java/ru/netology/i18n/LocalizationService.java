package ru.netology.i18n;

import ru.netology.i18n.entity.Country;

public interface LocalizationService {

    String locale(Country country);
}
