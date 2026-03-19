package com.contextrag.llm;

import com.contextrag.common.events.PromptEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class LLMListener {

    @EventListener
    public void handle(PromptEvent event) {
        System.out.println("LLM: Generating response for prompt: " + event.getPrompt());
    }
}
