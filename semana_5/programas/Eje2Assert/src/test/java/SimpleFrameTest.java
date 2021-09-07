import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.edt.GuiQuery;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleFrameTest {
    private FrameFixture window;
 
    @BeforeClass
    public static void setUpOnce() {
        FailOnThreadViolationRepaintManager.install();
    }
 
    @Before
    public void setUp() {
        SimpleFrame frame = GuiActionRunner.execute(new GuiQuery<SimpleFrame>() {
            @Override
            protected SimpleFrame executeInEDT() throws Throwable {
                return new SimpleFrame();
            }
        });
        window = new FrameFixture(frame);
        window.show(); // shows the frame to test
    }
 
    @Test
    public void shouldCopyTextInLabelWhenClickingButton() {
        window.textBox("Text1").enterText("Some random text");
        window.button("ButtonOk").click();
        window.label("Label1").requireText("Some random text");
    }
 
    @After
    public void tearDown() {
        window.cleanUp();
    }
}