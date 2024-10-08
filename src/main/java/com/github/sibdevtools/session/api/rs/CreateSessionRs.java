package com.github.sibdevtools.session.api.rs;

import com.github.sibdevtools.common.api.dto.ErrorRsDto;
import com.github.sibdevtools.common.api.rs.StandardBodyRs;
import com.github.sibdevtools.session.api.dto.SessionId;
import jakarta.annotation.Nonnull;

/**
 * Create session response
 *
 * @author sibmaks
 * @since 0.0.13
 */
public class CreateSessionRs extends StandardBodyRs<SessionId> {

    /**
     * Construct create session response
     *
     * @param sessionId session id
     */
    public CreateSessionRs(@Nonnull SessionId sessionId) {
        super(sessionId);
    }

    /**
     * Construct create session response with error
     *
     * @param error happened error
     */
    public CreateSessionRs(@Nonnull ErrorRsDto error) {
        super(error);
    }
}
