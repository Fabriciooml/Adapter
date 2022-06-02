import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MotorTest {

    @Test
    void deveRetornarConceitoAluno() {
        Motor motor = new Motor();
        motor.setCombustivel(10.0f);

        assertEquals(10.0f, motor.getCombustivel());
    }

    @Test
    void deveRetornarNotaAluno() {
        Motor motor = new Motor();
        motor.setCombustivel(10.0f);

        assertEquals(0.01f, motor.getTanque());
    }

}