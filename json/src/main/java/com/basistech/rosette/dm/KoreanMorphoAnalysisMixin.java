/******************************************************************************
 ** This data and information is proprietary to, and a valuable trade secret
 ** of, Basis Technology Corp.  It is given in confidence by Basis Technology
 ** and may only be used as permitted under the license agreement under which
 ** it has been distributed, and in no other way.
 **
 ** Copyright (c) 2014 Basis Technology Corporation All rights reserved.
 **
 ** The technical data and information provided herein are provided with
 ** `limited rights', and the computer software provided herein is provided
 ** with `restricted rights' as those terms are defined in DAR and ASPR
 ** 7-104.9(a).
 ******************************************************************************/

package com.basistech.rosette.dm;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * {@link HanMorphoAnalysis}
 */
public abstract class KoreanMorphoAnalysisMixin {
    @JsonCreator
    KoreanMorphoAnalysisMixin(@JsonProperty("partOfSpeech") String partOfSpeech,
                              @JsonProperty("lemma") String lemma,
                              @JsonProperty("components") List<Token> components,
                              @JsonProperty("raw") String raw,
                              @JsonProperty("morphemes") List<String> morphemes,
                              @JsonProperty("morphemeTags") List<String> morphemeTags,
                              @JsonProperty("extendedProperties") Map<String, Object> extendedProperties) {
        //
    }
}
