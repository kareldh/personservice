package com.example.personservice.person.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.util.UUID;

@JsonDeserialize(builder = Person.Builder.class)
@Table(value = "person")
public class Person {
    @Id
    private UUID id;
    @Column(value = "contractStartDate")
    private LocalDate contractStartDate;
    @Column(value = "contractEndDate")
    private LocalDate contractEndDate;

    private Person() {
        // For Spring data
    }

    private Person(Builder builder) {
        id = builder.id;
        contractStartDate = builder.contractStartDate;
        contractEndDate = builder.contractEndDate;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public LocalDate getContractEndDate() {
        return contractEndDate;
    }


    public static final class Builder {
        private UUID id;
        private LocalDate contractStartDate;
        private LocalDate contractEndDate;

        public Builder() {
        }

        public Builder withId(UUID val) {
            id = val;
            return this;
        }

        public Builder withContractStartDate(LocalDate val) {
            contractStartDate = val;
            return this;
        }

        public Builder withContractEndDate(LocalDate val) {
            contractEndDate = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
