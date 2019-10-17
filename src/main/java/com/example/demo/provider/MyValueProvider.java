package com.example.demo.provider;

import org.springframework.core.MethodParameter;
import org.springframework.shell.CompletionContext;
import org.springframework.shell.CompletionProposal;
import org.springframework.shell.standard.ValueProvider;

import java.util.List;

public class MyValueProvider implements ValueProvider {
    @Override
    public boolean supports(MethodParameter methodParameter, CompletionContext completionContext) {
        return false;
    }

    @Override
    public List<CompletionProposal> complete(MethodParameter methodParameter, CompletionContext completionContext, String[] strings) {
        return null;
    }
}
