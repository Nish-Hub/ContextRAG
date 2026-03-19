package com.contextrag.common.events;

/**
 * Domain event published when a prompt enters the RAG processing flow.
 */
public class PromptEvent {
    private final String prompt;

    /**
     * Creates a new prompt event.
     *
     * @param prompt prompt text being published
     */
    public PromptEvent(String prompt) {
        this.prompt = prompt;
    }

    /**
     * Returns the prompt carried by this event.
     *
     * @return prompt text
     */
    public String getPrompt() {
        return prompt;
    }
}
