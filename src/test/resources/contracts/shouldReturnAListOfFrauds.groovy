package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return a liste of frauds"
    request{
        url "/fraud"
        method GET()
    }
    response{
        status 201
        body(["ahmed","ali"])
    }
}

