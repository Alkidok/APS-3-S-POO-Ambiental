public class AnaliseDoSolo {
    
    private String phSolo;
    private String fosforoSolo;
    private String potassioSolo;
    private String calcioSolo;
    private String magnesioSolo;
    private String enxofreSolo;
    private String aluminioSolo;
    private String materiaOrganicaSolo;

    
    public void setPh(String ph) {
        this.phSolo = ph;
    }

    public void setFosforo(String fosforo) {
        this.fosforoSolo = fosforo;
    }

    public void setPotassio(String potassio) {
        this.potassioSolo = potassio;
    }

    public void setCalcio(String calcio) {
        this.calcioSolo = calcio;
    }

    public void setMagnesio(String magnesio) {
        this.magnesioSolo = magnesio;
    }

    public void setEnxofre(String enxofre) {
        this.enxofreSolo = enxofre;
    }

    public void setAluminio(String aluminio) {
        this.aluminioSolo = aluminio;
    }

    public void setMateriaOrganica(String materiaOrganica) {
        this.materiaOrganicaSolo = materiaOrganica;
    }

    public String analisarSolo() {
        StringBuilder resultado = new StringBuilder();

        resultado.append("\n");

        resultado.append("RESULTADO DA ANÁLISE DO SOLO\n\n");
        
        resultado.append("\n");

        resultado.append("PH DO SOLO: " + this.phSolo + "\n");
        if (Double.parseDouble(this.phSolo) < 1) {
            resultado.append("- O pH do solo está abaixo do recomendado, corrigir com calcário.\n");
        }
        resultado.append("\n");

        resultado.append("FÓSFORO NO SOLO: " + this.fosforoSolo + " mg/dm³\n");
        if (Double.parseDouble(this.fosforoSolo) < 1) {
            resultado.append("- O teor de fósforo no solo está abaixo do recomendado, corrigir com adubo fosfatado.\n");
        }
        resultado.append("\n");

        resultado.append("POTÁSSIO NO SOLO: " + this.potassioSolo + " cmolc/dm³\n");
        if (Double.parseDouble(this.potassioSolo) < 1) {
            resultado.append("- O teor de potássio no solo está abaixo do recomendado, corrigir com adubo potássico.\n");
        }
        resultado.append("\n");

        resultado.append("CÁLCIO NO SOLO: " + this.calcioSolo + " cmolc/dm³\n");
        if (Double.parseDouble(this.calcioSolo) < 1) {
            resultado.append("- O teor de cálcio no Solo está abaixo do recomendado, corrigir com calcário.\n");
        }
        resultado.append("\n");
        resultado.append("MAGNÉSIO NO SOLO: " + this.magnesioSolo + " cmolc/dm³\n");
        if (Double.parseDouble(this.magnesioSolo) < 1) {
            resultado.append("- O teor de magnésio no solo está abaixo do recomendado, corrigir com sulfato de magnésio.\n");
        }
        resultado.append("\n");
    
        resultado.append("ENXOFRE NO SOLO: " + this.enxofreSolo + " mg/dm³\n");
        if (Double.parseDouble(this.enxofreSolo) < 1) {
            resultado.append("- O teor de enxofre no solo está abaixo do recomendado, corrigir com gesso agrícola.\n");
        }
        resultado.append("\n");
    
        resultado.append("ALUMÍNIO NO SOLO: " + this.aluminioSolo + " cmolc/dm³\n");
        if (Double.parseDouble(this.aluminioSolo) > 1) {
            resultado.append("- O teor de alumínio no solo está acima do recomendado, correção apenas com técnicas específicas.\n");
        }
        resultado.append("\n");
    
        resultado.append("MATÉRIA ORGÂNICA NO SOLO: " + this.materiaOrganicaSolo + " g/dm³\n");
        if (Double.parseDouble(this.materiaOrganicaSolo) < 1) {
            resultado.append("- O teor de matéria orgânica no solo está abaixo do recomendado, correção com adição de matéria orgânica.\n");
        }
        return resultado.toString();
    }
}
