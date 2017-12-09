package com.kodilla.spring.reader;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import static java.time.LocalDate.*;


public class IfDayIsOddCondition implements org.springframework.context.annotation.Condition{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return (now().getDayOfMonth() % 2) != 0;
    }
}
