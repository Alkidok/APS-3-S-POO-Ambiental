import java.util.ArrayList;

public class AnaliseDoSolo {
    
    private ArrayList<String> indicadores;
    private ArrayList<String> niveis;
    private String phSolo;
    private String fosforoSolo;
    private String potassioSolo;
    private String calcioSolo;
    private String magnesioSolo;
    private String enxofreSolo;
    private String aluminioSolo;
    private String materiaOrganicaSolo;

    public AnaliseDoSolo() {
        this.indicadores = new ArrayList<String>();
        this.niveis = new ArrayList<String>();
    }

    public void addIndicador(String indicador, String nivel) {
        this.indicadores.add(indicador);
        this.niveis.add(nivel);
    }

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
        resultado.append("RESULTADO DA ANÁLISE DO SOLO\n\n");

        resultado.append("INDICADORES: ");
        for (int i = 0; i < this.indicadores.size(); i++) {
            resultado.append(this.indicadores.get(i) + " (" + this.niveis.get(i) + ") ");
        }
        resultado.append("\n\n");

        resultado.append("PH DO SOLO: " + this.phSolo + "\n");
        if (Double.parseDouble(this.phSolo) < 6.0) {
            resultado.append("- O pH do solo está abaixo do recomendado, corrigir com calcário.\n");
        }
        resultado.append("\n");

        resultado.append("FÓSFORO NO SOLO: " + this.fosforoSolo + " mg/dm³\n");
        if (Double.parseDouble(this.fosforoSolo) < 8.0) {
            resultado.append("- O teor de fósforo no solo está abaixo do recomendado, corrigir com adubo fosfatado.\n");
        }
        resultado.append("\n");

        resultado.append("POTÁSSIO NO SOLO: " + this.potassioSolo + " cmolc/dm³\n");
        if (Double.parseDouble(this.potassioSolo) < 0.2) {
            resultado.append("- O teor de potássio no solo está abaixo do recomendado, corrigir com adubo potássico.\n");
        }
        resultado.append("\n");

        resultado.append("CÁLCIO NO SOLO: " + this.calcioSolo + " cmolc/dm³\n");
        
        
        // ---
        if (Double.parseDouble(this.calcioSolo) < 5.0) {
            resultado.append("- O teor de cálcio no solo está abaixo do recomendado, corrigir com calcário.\n");
        }
        resultado.append("\n");

        resultado.append("MAGNÉSIO NO SOLO: " + this.magnesioSolo + " cmolc/dm³\n");
        if (Double.parseDouble(this.magnesioSolo) < 1.0) {
            resultado.append("- O teor de magnésio no solo está abaixo do recomendado, corrigir com calcário.\n");
        }
        resultado.append("\n");

        resultado.append("ENXOFRE NO SOLO: " + this.enxofreSolo + " mg/dm³\n");
        if (Double.parseDouble(this.enxofreSolo) < 9.0) {
            resultado.append("- O teor de enxofre no solo está abaixo do recomendado, corrigir com adubo sulfatado.\n");
        }
        resultado.append("\n");

        resultado.append("ALUMÍNIO NO SOLO: " + this.aluminioSolo + " cmolc/dm³\n");
        if (Double.parseDouble(this.aluminioSolo) > 0.0) {
            resultado.append("- O teor de alumínio no solo está acima do recomendado, corrigir com calagem.\n");
        }
        resultado.append("\n");

        resultado.append("MATÉRIA ORGÂNICA NO SOLO: " + this.materiaOrganicaSolo + "%\n");
        if (Double.parseDouble(this.materiaOrganicaSolo) < 2.0) {
            resultado.append("- O teor de matéria orgânica no solo está abaixo do recomendado, corrigir com adição de matéria orgânica.\n");
        }
        resultado.append("\n");

        resultado.append("RECOMENDAÇÕES:\n");
        for (int i = 0; i < this.indicadores.size(); i++) {
            String indicador = this.indicadores.get(i);
            String nivel = this.niveis.get(i);

            if (nivel.equals("baixo")) {
                resultado.append("- Aumentar " + indicador + " do solo com adubação.\n");
            } else if (nivel.equals("médio")) {
                resultado.append("- Manter " + indicador + " do solo com adubação.\n");
            } else if (nivel.equals("alto")) {
                resultado.append("- Diminuir " + indicador + " do solo com adubação.\n");
            }
        }

        return resultado.toString();
    }
}