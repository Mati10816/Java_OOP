package Main;

import Entity.TaxID;
import Service.TaxIDService;

public class Principal {

    public static void main(String[] args) {
        
        TaxIDService taxIdServ = new TaxIDService();
        
        TaxID newperson = taxIdServ.createTaxId();
        
        taxIdServ.showData(newperson);
        
        
        
    }

}
