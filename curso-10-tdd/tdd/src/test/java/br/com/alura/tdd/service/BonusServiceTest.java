package test.java.br.com.alura.tdd.service;

import main.java.br.com.alura.tdd.modelo.Funcionario;
import main.java.br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;


public class BonusServiceTest {

    @Test
    void naoDeveriaExistirBonusParaFuncionarioComAltoSalario() {
        BonusService service = new BonusService();
        Assertions.assertThrows(IllegalArgumentException.class,
        () -> service.calcularBonus(new Funcionario("Lucas", LocalDate.now(), new BigDecimal("11000"))));
    }

    @Test
    void bonusDeveriaSer10PorCentoDoSalario() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Lucas", LocalDate.now(), new BigDecimal("9000")));

        Assertions.assertEquals(new BigDecimal("900.00"), bonus);
    }

    @Test
    void bonusDeveriaSer10PorCentoDoSalarioDe1000() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Lucas", LocalDate.now(), new BigDecimal("10000")));

        Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
