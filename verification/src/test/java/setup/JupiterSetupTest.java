package setup;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class JupiterSetupTest {
    // Final classes exercise Mockito's inline mock maker on the current JDK.
    static final class Greeting {
        String text() { return "real"; }
    }

    @Mock Greeting greeting;

    @Test
    void junit5MockitoAndAssertJWorkTogether() {
        when(greeting.text()).thenReturn("ready");
        assertThat(greeting.text()).isEqualTo("ready");
        verify(greeting).text();
    }
}
