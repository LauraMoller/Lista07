/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Model;

/**
 *
 * @author molle
 */
public class Imovel {

    private String endereco;
    private int area;
    private Finalidade finalidade;
    private Bairro bairro;

    public Imovel(Finalidade finalidade, Bairro bairro, int area, String endereco) throws IllegalArgumentException {
        setFinalidade(finalidade);
        setBairro(bairro);
        setArea(area);
        setEndereco(endereco);
    }

    public double calcularIptu() throws IllegalArgumentException {
        if (bairro == null) {
            throw new IllegalArgumentException("O bairro não pode ser nulo");
        }
        if (bairro.getCoeficienteIptu() <= 0) {
            throw new IllegalArgumentException("O coeficiente deve ser maior do que 0");
        }
        if (finalidade == null) {
            throw new IllegalArgumentException("A finalidade não deve ser nula");
        }
        double areaECoeficiente = area * bairro.getCoeficienteIptu();

        if (finalidade == Finalidade.RESIDENCIAL) {
            return areaECoeficiente * 1;
        }

        if (finalidade == Finalidade.COMERCIAL) {
            if (area <= 100) {
                return 500;
            } else if (area <= 400) {
                return 1000;
            } else {
                return areaECoeficiente * 2.55;
            }
        }

        if (area <= 2000) {
            return 1000;
        } else {
            return areaECoeficiente * 0.55;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws IllegalArgumentException {
        if (endereco == null || endereco.isBlank()) {
            throw new IllegalArgumentException("É necessário informar um endereço válido");
        }
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) throws IllegalArgumentException {
        if (area <= 0) {
            throw new IllegalArgumentException("Á área deve ser maior do que 0");
        }
        this.area = area;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) throws IllegalArgumentException {
        if (finalidade == null) {
            throw new IllegalArgumentException("A finalidade não pode ser nula");
        }
        this.finalidade = finalidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) throws IllegalArgumentException {
        if (bairro == null) {
            throw new IllegalArgumentException("Bairro não pode ser nulo");
        }
        this.bairro = bairro;
    }

    /*

    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public Imovel(String endereco, int area, Bairro bairro, Finalidade finalidade) {
        setEndereco(endereco);
        setArea(area);
        setBairro(bairro);
        setFinalidade(finalidade);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws IllegalArgumentException {
        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("Enereço inválido");
        }
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) throws IllegalArgumentException {
        if (area < 0) {
            throw new IllegalArgumentException("A área não pode ser negativa");
        }
        this.area = area;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) throws IllegalArgumentException {
        if (bairro == null) {
            throw new IllegalArgumentException("Bairro não pode ser nulo");
        }
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) throws IllegalArgumentException {
        if (finalidade == null) {
            throw new IllegalArgumentException("Finalidade não pode ser nula");
        }
        this.finalidade = finalidade;
    }

    public double calcularIptu() throws IllegalArgumentException {
        if (bairro == null) {
            throw new IllegalArgumentException("Imóvel não está associado a um bairro.");
        }
        if (finalidade == null) {
            throw new IllegalArgumentException("Imóvel não tem finalidade definida.");
        }
        if (area <= 0) {
            throw new IllegalArgumentException("Área do imóvel inválida.");
        }

        if (finalidade == Finalidade.RESIDENCIAL) {
            return 1 * area * bairro.getCoeficienteIptu();
        }
        if (finalidade == Finalidade.COMERCIAL) {
            if (area <= 100) {
                return 500 * bairro.getCoeficienteIptu();
            } else if (area <= 400) {
                return 1000 * bairro.getCoeficienteIptu();
            } else {
                return area * 2.5 * bairro.getCoeficienteIptu();
            }
        }
        if (finalidade == Finalidade.INDUSTRIAL) {
            if (area <= 2000) {
                return 1000 * bairro.getCoeficienteIptu();
            } else {
                return area * 0.55 * bairro.getCoeficienteIptu();
            }
        }
        return 0;
    }*/
}
