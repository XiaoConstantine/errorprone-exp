package errorprone;

import com.google.auto.service.AutoService;
import com.google.errorprone.BugPattern;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.BugChecker;
import com.google.errorprone.matchers.Description;
import com.sun.source.tree.MethodTree;


@AutoService(BugChecker.class)
@BugPattern(
        name = "FooBar",
        summary = "You can't name a function FooBar",
        severity = BugPattern.SeverityLevel.ERROR,
        linkType = BugPattern.LinkType.NONE
)
public class FooBarChecker extends BugChecker implements BugChecker.MethodTreeMatcher {

    @Override
    public Description matchMethod(MethodTree methodTree, VisitorState visitorState) {
        if(methodTree.getBody().getStatements().isEmpty()) {
            return describeMatch(methodTree);
        }
        return Description.NO_MATCH;
    }
}