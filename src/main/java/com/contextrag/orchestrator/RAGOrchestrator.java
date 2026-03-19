package com.contextrag.orchestrator;

import com.contextrag.common.events.PromptEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * Coordinates prompt intake and publishes events for downstream processing.
 */
@Service
public class RAGOrchestrator {

    private final ApplicationEventPublisher publisher;

    /**
     * Creates the orchestrator with the event publisher used to notify listeners.
     *
     * @param publisher Spring event publisher
     */
    public RAGOrchestrator(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    /**
     * Accepts a prompt and emits a domain event for the rest of the pipeline.
     *
     * @param prompt prompt text submitted by the caller
     */
    public void handlePrompt(String prompt) {
        PromptEvent event = new PromptEvent(prompt);
        System.out.println("Orchestrator: Prompt received for eventId=" + event.getEventId());
        publisher.publishEvent(event);
    }
}
