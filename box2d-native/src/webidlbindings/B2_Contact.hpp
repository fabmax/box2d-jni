#pragma once

#include <box2d/box2d.h>

class B2_Contact {
    public:

    /// Contact identifier validation. Provides validation for up to 2^32 allocations.
    static inline bool isValid(b2ContactId id) {
        return b2Contact_IsValid(id);
    }

    /// Get the data for a contact. The manifold may have no points if the contact is not touching.
    static inline b2ContactData getData(b2ContactId contactId) {
        return b2Contact_GetData(contactId);
    }
};
