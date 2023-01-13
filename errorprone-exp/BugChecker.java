package errorprone;


@AutoService(BugChecker.class)
public class FooBarChecker extends BugChecker implements BugChecker.MethodTreeMatcher {

    @Override
    public Description matchMethod(MethodTree methodthree, VisitorState VisitorState) {
        
    }

}