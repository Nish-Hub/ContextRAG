package com.contextrag.common.events;

public class PromptEvent {
    private final String prompt;

    public PromptEvent(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }
}
