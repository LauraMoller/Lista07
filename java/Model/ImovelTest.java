/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import java.text.DecimalFormat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author molle
 */
public class ImovelTest {
/*
    private static Imovel i;
    private static Bairro b;
    private static DecimalFormat df;

    public ImovelTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1() {
        b = new Bairro("a", 1);
        i = new Imovel("Rua", -5, b, Finalidade.RESIDENCIAL);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        b = new Bairro("Centro", 1);
        i = ("Rua", b, Finalidade.RESIDENCIAL
        );
        i.calcularIptu();
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        b = new Bairro("Centro", 1);
        i = ("Rua", 250, b, null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularIptuSemBairro() {
        Imovel imovel = new Imovel("Rua A", 250, null, Finalidade.RESIDENCIAL);
        imovel.calcularIptu();
    }
 

    @Test
    public void testCalcularIptuResidencial() {
        Bairro bairro = new Bairro("Centro", 1.0);
        Imovel imovel = new Imovel("Rua B", 400, bairro, Finalidade.RESIDENCIAL);
        assertEquals(400.0, imovel.calcularIptu(), 0.01);
    }

    @Test
    public void testCalcularIptuComercialAte100() {
        Bairro bairro = new Bairro("Centro", 1.0);
        Imovel imovel = new Imovel("Rua C", 80, bairro, Finalidade.COMERCIAL);
        assertEquals(500.0, imovel.calcularIptu(), 0.01);
    }

    @Test
    public void testCalcularIptuComercialEntre100e400() {
        Bairro bairro = new Bairro("Centro", 1.0);
        Imovel imovel = new Imovel("Rua D", 250, bairro, Finalidade.COMERCIAL);
        assertEquals(1000.0, imovel.calcularIptu(), 0.01);
    }

    @Test
    public void testCalcularIptuComercialAcima400() {
        Bairro bairro = new Bairro("Centro", 1.0);
        Imovel imovel = new Imovel("Rua E", 500, bairro, Finalidade.COMERCIAL);
        assertEquals(1275.0, imovel.calcularIptu(), 0.01);
    }

    @Test
    public void testCalcularIptuIndustrialAte2000() {
        Bairro bairro = new Bairro("Centro", 1.0);
        Imovel imovel = new Imovel("Rua F", 2000, bairro, Finalidade.INDUSTRIAL);
        assertEquals(1000.0, imovel.calcularIptu(), 0.01);
    }

    @Test
    public void testCalcularIptuIndustrialAcima2000() {
        Bairro bairro = new Bairro("Centro", 1.0);
        Imovel imovel = new Imovel("Rua G", 3000, bairro, Finalidade.INDUSTRIAL);
        assertEquals(1650.0, imovel.calcularIptu(), 0.01);
    }

    @Test
    public void testCalcularIptuCoeficiente2_5() {
        Bairro bairro = new Bairro("Centro", 2.5);
        Imovel imovel = new Imovel("Rua H", 500, bairro, Finalidade.RESIDENCIAL);
        assertEquals(1250.0, imovel.calcularIptu(), 0.01);
    }
*/
}
