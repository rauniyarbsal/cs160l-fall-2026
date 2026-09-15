package setup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class VintageSetupTest {
    @Mock private List<String> values;

    @Test
    public void junit4AndMockitoRunnerWorkTogether() {
        when(values.size()).thenReturn(3);
        assertEquals(3, values.size());
    }
}
