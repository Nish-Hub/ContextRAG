package com.contextrag.llm;

import com.contextrag.common.events.PromptEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Consumes prompt events and represents the LLM processing stage.
 */
@Component
public class LLMListener {

    /**
     * Handles prompt events emitted by the orchestrator.
     *
     * @param event prompt event to process
     */
    @EventListener
    public void handle(PromptEvent event) {
        System.out.println("LLM: Generating response for prompt: " + event.getPrompt());
    }
}
