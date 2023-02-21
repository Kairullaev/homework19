public enum Planeta {
    EARTH("Planeta zemlya "),
    MARS("Mars jer planetasyna okshosh "),
    SATURN("шестая планета от Солнца"),
    JUPITER("Kyn sistemasyndagy en chon planeta ");

    private String information;

    Planeta(String information) {
        this.information = information;
    }

    public String getInformation() {
        return information;
    }
}
