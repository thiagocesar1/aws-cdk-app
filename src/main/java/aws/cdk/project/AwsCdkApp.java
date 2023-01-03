package aws.cdk.project;

import software.amazon.awscdk.App;
import software.amazon.awscdk.StackProps;

public class AwsCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        new VpcStack(app, "Vpc2");

        app.synth();
    }
}

