package oslomet.webprog;


public class Billett {
    private String fornavn;
    private String etternavn;
    private String telefonnummer;
    private String epost;
    private String antall;
    private String filmer;


    public Billett(String fornavn, String etternavn, String telefonnummer, String epost, String antall, String filmer) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnummer = telefonnummer;
        this.epost = epost;
        this.antall = antall;
        this.filmer = filmer;
    }


    public Billett() {
    }

    public String getFornavn() { return fornavn; }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() { return etternavn; }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }


    public String getTelefonnummer() { return telefonnummer; }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }


    public String getEpost() { return epost; }

    public void setEpost(String epost) {
        this.epost = epost;
    }


    public String getAntall() { return antall; }

    public void setAntall(String antall) {
        this.antall = antall;
    }


    public String getFilmer() { return filmer; }

    public void setFilmer(String filmer) {
        this.filmer = filmer;
    }



}
