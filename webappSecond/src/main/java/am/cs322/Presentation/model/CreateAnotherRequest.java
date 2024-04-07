package am.cs322.Presentation.model;

import jakarta.annotation.Nonnull;

public record CreateAnotherRequest(@Nonnull long id, @Nonnull boolean isCredit) {
}
