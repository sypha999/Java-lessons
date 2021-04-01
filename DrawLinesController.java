import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawLinesController { 
   @FXML private Canvas canvas; // used to get the GraphicsContext

   // when user presses Draw Lines button, draw two Lines in the Canvas 
   

double getWidthAdder=canvas.getWidth()/30;

double getHeightAdder=canvas.getHeight()/30;

int liner=1;

@FXML
   void drawLinesButtonPressed(ActionEvent event)
    {
      // get the GraphicsContext, which is used to draw on the Canvas
      GraphicsContext gc = canvas.getGraphicsContext2D();

while(liner<=30){
  gc.strokeLine(0, 0, liner*getWidthAdder,getHeightAdder-canvas.getHeight()*liner);
liner+=1;


  }
 }
}