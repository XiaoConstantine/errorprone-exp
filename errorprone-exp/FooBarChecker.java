package errorprone;

import com.google.auto.service.AutoService;
import com.google.errorprone.BugPattern;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.BugChecker;
import com.google.errorprone.matchers.Description;
import com.sun.source.tree.MethodTree;


@AutoService(BugChecker.class)
@BugPattern(
        name = "FooBar bug",
        summary = "You can't name a function FooBar",
        severity = BugPattern.SeverityLevel.ERROR
)
public class FooBarChecker extends BugChecker implements BugChecker.MethodTreeMatcher {

    @Override
    public Description matchMethod(MethodTree methodthree, VisitorState VisitorState) {
        if(methodthree.getName().contentEquals("FooBar")) {
            return describeMatch(methodthree);
        }
        return Description.NO_MATCH;
    }

}