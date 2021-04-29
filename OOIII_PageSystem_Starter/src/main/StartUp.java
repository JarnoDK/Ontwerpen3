package main;

import domein.ReportDocument;
import domein.ResumeDocument;

import java.util.ArrayList;
import java.util.List;
import domein.Document;

public class StartUp {

    private List<Document> documents;

    public static void main(String[] args) {
        new StartUp().run();
    }

    private void run() {
        documents = new ArrayList<>();
        
        documents.add(new ReportDocument());
        documents.add(new ResumeDocument());
        documents.forEach(doc -> System.out.printf("\n%s:\n%s\n",
                doc.getClass().getSimpleName(),
                doc.print())
        );
    }

}
