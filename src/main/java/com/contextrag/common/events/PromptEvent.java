package com.contextrag.common.events;

import java.util.UUID;
import lombok.Getter;

/**
 * Domain event published when a prompt enters the RAG processing flow.
 */
@Getter
public class PromptEvent {
    private final String eventId;
    private final String prompt;

    /**
     * Creates a new prompt event.
     *
     * @param prompt prompt text being published
     */
    public PromptEvent(String prompt) {
        this.eventId = UUID.randomUUID().toString();
        this.prompt = prompt;
    }
}
