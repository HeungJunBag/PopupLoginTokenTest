package com.heungjun.popuplogintoken.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CheckNicknameResponse(
    @SerialName("result") val result: Boolean,  // 닉네임 사용 가능 여부
    @SerialName("message") val message: String,  // 서버에서 제공하는 메시지
    @SerialName("data") val data: String? = null  // 추가 데이터 (현재 null)
)