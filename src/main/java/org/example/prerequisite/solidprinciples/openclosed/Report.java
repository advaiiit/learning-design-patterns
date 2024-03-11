package org.example.prerequisite.solidprinciples.openclosed;

// Open Closed Principle states that software entities (classes, modules, functions, etc.) should be open for
// extension but closed for modification. This means that the behavior of a module should be extendable without
// modifying its source code.

// Abstract class representing a report
abstract class Report {
    public abstract void generate();
}

// Concrete class for generating PDF reports
class PDFReport extends Report {
    @Override
    public void generate() {
        System.out.println("Generating PDF report");
    }
}

// Interface for report format
interface ReportFormat {
    void generate(Report report);
}

// Concrete class of generating Excel reports
class ExcelReportGenerator implements ReportFormat {
    @Override
    public void generate(Report report) {
        System.out.println("Generating Excel report");
    }
}

// Concrete class for generating CSV reports
class CSVReportGenerator implements ReportFormat {
    @Override
    public void generate(Report report) {
        System.out.println("Generating CSV report");
    }
}

class Main {
    public static void main(String[] args) {
        // Client code
        Report pdfReport = new PDFReport();
        pdfReport.generate();

        // Extension point: adding support for Excel reports
        ReportFormat excelReportFormat = new ExcelReportGenerator();
        excelReportFormat.generate(pdfReport);

        // Extension point: adding support for CSV reports
        ReportFormat csvReportFormat = new CSVReportGenerator();
        csvReportFormat.generate(pdfReport);
    }
}

// Initially, the system supports generating only PDF reports
// To make the system extensible, we introduce the 'ReportFormat' interface.
// This interface defines a method 'generate(Report report)'
// Concrete implementations of 'ReportFormat' interface provide support in generating reports in Excel and CSV
// This design adheres to OCP because the behavior of Report class is open for extension (new report formats can be added)
// but closed for modification (existing code doesn't need to be changed to support new formats).