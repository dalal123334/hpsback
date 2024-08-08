package org.sid.projet_hps.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;


@Entity
@Table(name = "account_institution_info")
@Getter
@Setter
public class AccountInstitutionInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;
    @NotNull
    private String acquiringInstitutionIdCode; // Field 32: Acquiring Institution ID Code
    @NotNull
    private String forwardingInstitutionIdCode; // Field 33: Forwarding Institution ID Code
}
