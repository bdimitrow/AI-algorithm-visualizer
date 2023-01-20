module com.sofia.uni.ai.aialgorithmvisualizer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.sofia.uni.ai.aialgorithmvisualizer to javafx.fxml;
    exports com.sofia.uni.ai.aialgorithmvisualizer;
}