package mpp.lesson10.prob1.javapackage;

import mpp.lesson10.prob1.bugreporter.BugReport;

@BugReport(assignedTo="Tom Jones", 
severity=1, 
reportedBy="Corazza",
description="The Complexity is N and the original requeriments said Nlogn")
public interface ClosedCurve {
	public double computePerimeter();
}
