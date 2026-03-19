package com.contextrag.orchestrator;

import com.contextrag.common.events.PromptEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class RAGOrchestrator {

    private final ApplicationEventPublisher publisher;

    public RAGOrchestrator(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void handlePrompt(String prompt) {
        System.out.println("Orchestrator: Prompt received");
        publisher.publishEvent(new PromptEvent(prompt));
    }
}
