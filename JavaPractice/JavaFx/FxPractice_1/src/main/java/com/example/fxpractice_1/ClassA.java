package com.example.fxpractice_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;


//Stage (ie JFrame )-> scene (JPanel) -> Scene Graph -> Nodes (Buttons , text boxes etc)

public class ClassA extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // We can also use stage which is defined in function parameter
        // or we can create a new one

//        Stage newStage = new Stage(); // we can create new one


         stage.setTitle("ClassA");


        Scene scene = new Scene(); // 
/* Root Nodes
In JavaFX, a Root Node is the top-level node in a scene graph. A scene graph is a
hierarchical structure that contains all the nodes (elements) of the user interface.
The root node is the entry point of this graph, meaning that every other UI component
or node (buttons, labels, containers, etc.) is a child, descendant, or part of the
subtree that originates from this root node.

### Key Points about Root Nodes:

1. **Single Entry Point**: Each JavaFX `Scene` can have only one root node. The `Scene` is essentially a container that holds the entire visual structure of your application, and the root node is its main entry point.

2. **Common Root Nodes**:
   - **`Pane`**: A basic layout container that can hold other nodes.
   - **`Group`**: A container that holds a collection of nodes, used when positioning is not constrained by layout.
   - **`BorderPane`**: A layout pane with five regions (top, bottom, left, right, center).
   - **`VBox`** / **`HBox`**: Containers for arranging children vertically or horizontally.
   - **`StackPane`**: A layout pane that lays out its children in a single stack.
   - **`AnchorPane`**: Allows you to anchor children nodes to the top, bottom, left, or right.
   - **`GridPane`**: A grid-based container, where components are organized in a row-column format.

3. **Adding to a Scene**: When creating a JavaFX application, you usually set the root node when creating a `Scene`. For example:

   ```java
   Parent root = new VBox(); // VBox is used as the root node.
   Scene scene = new Scene(root, 800, 600); // Root is assigned to the scene.
   stage.setScene(scene);
   stage.show();
   ```

4. **Parent Class**: The root node typically extends the `Parent` class, which is a base class for all nodes that can have children. Most layout containers (like `Pane`, `VBox`, etc.) are subclasses of `Parent`.

5. **Node Hierarchy**: From the root node, you can have a complex hierarchy of children nodes that define the UI structure. The entire UI is managed and manipulated starting from the root.

### Example

Here’s an example where a `BorderPane` is used as the root node:

```java
BorderPane root = new BorderPane();
root.setTop(new Button("Top Button"));
root.setCenter(new Label("Center Label"));
root.setBottom(new Button("Bottom Button"));

Scene scene = new Scene(root, 400, 300);
primaryStage.setScene(scene);
primaryStage.show();
```

In this example, `BorderPane` is the root node, and it organizes its children (`Button`, `Label`) in a structured layout.

### Why Root Node is Important
- **Scene Management**: The root node defines the structure of all components and how they are rendered in a `Scene`.
- **Event Handling**: Event handling often starts from the root node and propagates through its children.
- **Styling**: CSS styles can be applied to the entire application starting from the root node.

Feel free to ask more if you need deeper insights or specific examples!

 */

         stage.show();
    }


    public static void main(String[] args) {
        launch(args); // it static method inherited in ClassA from Application class
//        Application.launch(args);  //i.e static method
    }
}
