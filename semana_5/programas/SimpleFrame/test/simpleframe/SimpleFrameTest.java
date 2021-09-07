/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleframe;

//import assertj-swing-junit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

    
    public class SimpleFrameTest {
    private FrameFixture window;
 
    
 
    @Test
    public void shouldCopyTextInLabelWhenClickingButton() {
        window.textBox("Text1").enterText("Some random text");
        window.button("ButtonOk").click();
        window.label("Label1").requireText("Some random text");
    }
 
}