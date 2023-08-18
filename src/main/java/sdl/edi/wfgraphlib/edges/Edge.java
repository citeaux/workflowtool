package sdl.edi.wfgraphlib.edges;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.beans.InvalidationListener;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableObjectValue;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import sdl.edi.wf.MyFxmlController;
import sdl.edi.wfgraphlib.graph.Graph;
import sdl.edi.wfgraphlib.graph.ICell;

public class Edge extends AbstractEdge {

	private transient final StringProperty textProperty;
	private  ObservableObjectValue<? extends Paint> colorProperty;
	private SimpleObjectProperty colort;
     
        private String saveStringProperty; 

	public Edge(ICell source, ICell target) {
		super(source, target);
		textProperty = new SimpleStringProperty();
		
		colort = new SimpleObjectProperty<>(Paint.valueOf(Color.BLACK.toString()));
		colorProperty=colort;
	}
	
	public void setSaveStrokePaintProprty(Paint strokepaint) {
		colort.setValue(strokepaint);
	}

	@Override
	public EdgeGraphic getGraphic(Graph graph) {
		return new EdgeGraphic(graph, this, textProperty,colorProperty);
	}

	
	
	public ObservableObjectValue<? extends Paint> getColorProperty() {
		return colorProperty;
	}

	public void setColorProperty(ObservableObjectValue<? extends Paint> colorProperty) {
		this.colorProperty = colorProperty;
	}

	public StringProperty textProperty() {
		return textProperty;
	}

    public String getSaveStringProperty() {
        return saveStringProperty;
    }

    public void setSaveStringProperty(String saveStringProperty) {
        this.saveStringProperty = saveStringProperty;
    }
        
        

	public static class EdgeGraphic extends Pane {
		Logger logger = LoggerFactory.getLogger(EdgeGraphic.class);
		private final Group group;
		// private final Arrow arrow;
		private final Line line, lineR, lineL;

		private final Text text;
                private final Button codeprops;

		public EdgeGraphic(Graph graph, Edge edge, StringProperty textProperty, ObservableObjectValue<? extends Paint> colorProperty) {
			group = new Group();
			line = new Line();
			lineR = new Line();
			lineL=new Line();
			final DoubleBinding sourceX = edge.getSource().getXAnchor(graph, edge);
			final DoubleBinding sourceY = edge.getSource().getYAnchor(graph, edge);
			final DoubleBinding targetX = edge.getTarget().getXAnchor(graph, edge);
			final DoubleBinding targetY = edge.getTarget().getYAnchor(graph, edge);

			line.startXProperty().bind(sourceX);
			line.startYProperty().bind(sourceY);

			line.endXProperty().bind(targetX);
			line.endYProperty().bind(targetY);
			
			final DoubleBinding angle =new DoubleBinding() {
				{
					super.bind(sourceY);
					super.bind(sourceX);
					super.bind(targetY);
					super.bind(targetX);
					 
				}

				@Override
			     protected double computeValue() {
				return Math.atan2((sourceY.doubleValue() - targetY.doubleValue()), (sourceX.doubleValue() - targetX.doubleValue())) - Math.PI / 2.0;
				}
			};
					
					
					
			final DoubleBinding sin = new DoubleBinding() {
				{
					super.bind(angle);
				}
				@Override
			     protected double computeValue() {
				return Math.sin(angle.doubleValue());
				}
					    
					    
			};
			final DoubleBinding cos =  new DoubleBinding() {
				{
					super.bind(angle);
				}
				@Override
			     protected double computeValue() {
				return Math.cos(angle.doubleValue());
				}
					    
					    
			};
	        		
	        		
	        	
	        final double arrowHeadSize=10.0;
	        
	        final DoubleBinding x1 = new DoubleBinding() {
	    		{
					super.bind(cos);
					super.bind(sin);
					super.bind(targetX);
				}
	        	
	        	@Override
			     protected double computeValue() {
	        		
	        	return	targetX.doubleValue() -( (- 1.0 / 2.0 * cos.doubleValue() + Math.sqrt(3) / 2 * sin.doubleValue()) * arrowHeadSize);
	        	}
	        
	        };
	        
	        
	        final DoubleBinding y1 = new DoubleBinding() {
	    		{
					super.bind(cos);
					super.bind(sin);
					super.bind(targetY);
				}
	        	
	        	@Override
			     protected double computeValue() {
	        		
	        	return	targetY.doubleValue() -((- 1.0 / 2.0 * sin.doubleValue() - Math.sqrt(3) / 2 * cos.doubleValue()) * arrowHeadSize)  ;
	        	}
	        
	        };
	        
	        
	        final DoubleBinding x2 = new DoubleBinding() {
	    		{
					super.bind(cos);
					super.bind(sin);
					super.bind(targetX);
				}
	        	
	        	@Override
			     protected double computeValue() {
	        		
	        	return	targetX.doubleValue() - ((1.0 / 2.0 * cos.doubleValue() + Math.sqrt(3) / 2 * sin.doubleValue()) * arrowHeadSize );
	        	}
	        
	        };
	  
	        //point2
	        
	        final DoubleBinding y2 = new DoubleBinding() {
	    		{
					super.bind(cos);
					super.bind(sin);
					super.bind(targetY);
				}
	    		
	        	
	        	@Override
			     protected double computeValue() {
	        		
	        	return	targetY.doubleValue() -((1.0 / 2.0 * sin.doubleValue() - Math.sqrt(3) / 2 * cos.doubleValue()) * arrowHeadSize );
	        	}
	        
	        };
	        
	        
	      
   
	        
	        lineL.startXProperty().bind(targetX);
	        lineL.startYProperty().bind(targetY);
	        lineL.endXProperty().bind(x2);
			lineL.endYProperty().bind(y2);
	        
	        lineR.startXProperty().bind(targetX);
	        lineR.startYProperty().bind(targetY);
	        lineR.endXProperty().bind(x1);
			lineR.endYProperty().bind(y1);
			
			//arrow= new Arrow((double) targetX.getValue() , (double) targetY.getValue()  , (double) targetX.getValue() , targetY.getValue());
			
			line.strokeProperty().bind(colorProperty);
			
			 lineR.strokeProperty().bind(colorProperty);
			 
			lineL.strokeProperty().bind(colorProperty);
			
		
			
			//logger.debug("Line XY" + lineL.endXProperty().get());
			group.getChildren().add(line);
			group.getChildren().add(lineL);
			group.getChildren().add(lineR);
			final DoubleProperty textWidth = new SimpleDoubleProperty();
			final DoubleProperty textHeight = new SimpleDoubleProperty();
                        codeprops = new Button("Code");
			text = new Text();
			text.textProperty().bind(textProperty);
			
			text.getStyleClass().add("edge-text");
                      
			text.xProperty().bind(line.startXProperty().add(line.endXProperty()).divide(2).subtract(textWidth.divide(2)));
			text.yProperty().bind(line.startYProperty().add(line.endYProperty()).divide(2).subtract(textHeight.divide(2)));
			final Runnable recalculateWidth = () -> {
				textWidth.set(text.getLayoutBounds().getWidth());
				textHeight.set(text.getLayoutBounds().getHeight());
			};
			text.parentProperty().addListener((obs, oldVal, newVal) -> recalculateWidth.run());
			text.textProperty().addListener((obs, oldVal, newVal) -> recalculateWidth.run());
			group.getChildren().add(text);
			//group.getChildren().add(arrow);
			getChildren().add(group);
		}

		public Group getGroup() {
			return group;
		}

		public Line getLine() {
			return line;
		}

		public Text getText() {
			return text;
		}
                
                public void setLineColor(Paint paint){

                    line.setFill(paint);
                    lineL.setFill(paint);
                    lineR.setFill(paint);
                }

	}

}