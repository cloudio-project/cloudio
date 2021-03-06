package ch.hevs.cloudio.cloud.microservice.auth

enum class Authority(val value: String) {
    BROKER_ADMINISTRATION("administrator"),
    BROKER_MONITORING("monitoring"),
    BROKER_POLICYMAKER("policymaker"),
    BROKER_MANAGEMENT("management"),

    HTTP_ACCESS("http_access")
}
