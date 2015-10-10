package com.addresscrud.model;

/**
 * Created by elena on 08.10.15.
 */
public enum Countries {


    ARGENTINA("Argentina", "AR", "ARG", "032"),
    AUSTRALIA("Australia", "AU", "AUS", "036"),
    CHINA("China", "CN", "CHN", "156"),
    DENMARK("Denmark", "DK", "DNK", "208"),
    FRANCE("France", "FR", "FRA", "250"),
    RUSSIAN_FEDERATION("Russian Federation", "RU", "RUS", "643"),
    UKRAINE("Ukraine", "UA", "UKR", "804"),
    UNITED_KINGDOM("United Kingdome", "GB", "GBR", "826"),
    UNITED_STATES("Unites States", "US", "USA", "840");

    private String countryName;
    private String A2Code;
    private String A3Code;
    private String NMCode;

    Countries(String countryName, String A2Code, String A3Code, String NMCode) {
        this.countryName = countryName;
        this.A2Code = A2Code;
        this.A3Code = A3Code;
        this.NMCode = NMCode;
    }

    /**
     * <p>Returns the ISO-3166 country name.</p>
     *
     * @return {@link String}
     */
    public String getCountryName()
    {
        return countryName;
    }

    /**
     * <p>Returns the ISO-3166 two character country code.</p>
     *
     * @return {@link String}
     */
    public String getCountryCodeA2()
    {
        return A2Code;
    }

    /**
     * <p>Returns the ISO-3166 three character country code.</p>
     *
     * @return {@link String}
     */
    public String getCountryCodeA3()
    {
        return A3Code;
    }

    /**
     * <p>Returns the ISO-3166 three digit numerical country code.</p>
     *
     * @return {@link String}
     */
    public String getCountryCodeNM()
    {
        return NMCode;
    }
    }
